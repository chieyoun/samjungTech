package com.chieyoun.board.controller;

import com.chieyoun.board.config.auth.PrincipalDetails;
import com.chieyoun.board.domain.item.Item;
import com.chieyoun.board.service.BoardService;
import com.chieyoun.board.service.ItemService;
import com.chieyoun.board.service.UserPageService;
import com.chieyoun.board.web.dto.auth.BoardDto;
import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class MainController {
    private BoardService boardService;
    private final UserPageService userPageService;

    private final ItemService itemService;
    @GetMapping("/")
    public String nologin(Model model, @RequestParam(value="page", defaultValue = "1") Integer pageNum) {
        List<BoardDto> boardList = boardService.getBoardlist(pageNum);
        Integer[] pageList = boardService.getPageList(pageNum);

        model.addAttribute("boardList", boardList);
        model.addAttribute("pageList", pageList);

        List<Item> items = itemService.allItemView();
        model.addAttribute("items", items);


        return "main.html";
    }

    @GetMapping("/main")
    public String mainPage(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails,@RequestParam(value="page", defaultValue = "1") Integer pageNum) {
        List<BoardDto> boardList = boardService.getBoardlist(pageNum);
        Integer[] pageList = boardService.getPageList(pageNum);

        model.addAttribute("boardList", boardList);
        model.addAttribute("pageList", pageList);

        if (principalDetails.getUser().getRole().equals("ROLE_SELLER")) {
            // 판매자
            int sellerId = principalDetails.getUser().getId();
            List<Item> items = itemService.allItemView();
            model.addAttribute("items", items);
            model.addAttribute("user", userPageService.findUser(sellerId));

        } else {
//             구매자
            int userId = principalDetails.getUser().getId();
            List<Item> items = itemService.allItemView();
            model.addAttribute("items", items);
            model.addAttribute("user", userPageService.findUser(userId));


        }
            return "main.html";

    }

}
