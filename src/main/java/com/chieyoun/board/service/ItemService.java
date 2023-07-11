package com.chieyoun.board.service;


import com.chieyoun.board.domain.item.Item;
import com.chieyoun.board.domain.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class ItemService {

    private final ItemRepository itemRepository;
//    private final CartService cartService;

    // 상품 등록


    public void saveItem(Item item, MultipartFile imgFile) throws Exception {
        String oriImgName = imgFile.getOriginalFilename();
        String imgName = "";

        String projectPath = StringUtils.cleanPath(System.getProperty("user.dir")) + "/file/";

        // UUID 를 이용하여 파일명 새로 생성
        UUID uuid = UUID.randomUUID();
        String savedFileName = uuid + "_" + oriImgName;
        imgName = savedFileName;

        InputStream inputStream = imgFile.getInputStream();
        File saveFile = new File(projectPath, imgName);
        Files.copy(inputStream, saveFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

        item.setImgName(imgName);
        item.setImgPath("/file/" + imgName);

        itemRepository.save(item);
    }


    // 상품 개별 불러오기
    public Item itemView(Integer id) {
        return itemRepository.findById(id).get();
    }

    // 상품 리스트 불러오기
    public List<Item> allItemView() {
        return itemRepository.findAll();
    }

    // 상품 리스트 페이지용 불러오기
    public Page<Item> allItemViewPage(Pageable pageable) {
        return itemRepository.findAll(pageable);
    }

    // 상품 수정


    @Transactional
    public void itemModify(Item item, Integer id, MultipartFile imgFile) throws Exception {
        String projectPath = StringUtils.cleanPath(System.getProperty("user.dir")) + "/file/";

        UUID uuid = UUID.randomUUID();
        String fileName = uuid + "_" + imgFile.getOriginalFilename();

        try (InputStream inputStream = imgFile.getInputStream()) {
            Path filePath = Paths.get(projectPath, fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        }

        Item update = itemRepository.findItemById(id);
        update.setName(item.getName());
        update.setEditor(item.getEditor());
        update.setPrice(item.getPrice());
        update.setStock(item.getStock());
        update.setIsSoldout(item.getIsSoldout());
        update.setImgName(fileName);
        update.setImgPath("/file/" + fileName);

        itemRepository.save(update);
    }

    // 상품 삭제
    @Transactional
    public void itemDelete(Integer id) {
        // cartItem 중에 해당 id 를 가진 item 찾기
//        List<CartItem> items = cartService.findCartItemByItemId(id);
//
//        for(CartItem item : items) {
//            cartService.cartItemDelete(item.getId());
//        }

        itemRepository.deleteById(id);
    }

    // 상품 검색
    public Page<Item> itemSearchList(String searchKeyword, Pageable pageable) {

        return itemRepository.findByNameContaining(searchKeyword, pageable);
    }

}
