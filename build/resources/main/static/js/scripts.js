window.addEventListener('DOMContentLoaded', event => {

    // Navbar shrink function
    var navbarShrink = function () {
        const navbarCollapsible = document.body.querySelector('#mainNav');
        if (!navbarCollapsible) {
            return;
        }
        if (window.scrollY === 0) {
            navbarCollapsible.classList.remove('navbar-shrink')
        } else {
            navbarCollapsible.classList.add('navbar-shrink')
        }

    };

    // Shrink the navbar
    navbarShrink();

    // Shrink the navbar when page is scrolled
    document.addEventListener('scroll', navbarShrink);

    // Activate Bootstrap scrollspy on the main nav element
    const mainNav = document.body.querySelector('#mainNav');
    if (mainNav) {
        new bootstrap.ScrollSpy(document.body, {
            target: '#mainNav',
            rootMargin: '0px 0px -40%',
        });
    };

    // Collapse responsive navbar when toggler is visible
    const navbarToggler = document.body.querySelector('.navbar-toggler');
    const responsiveNavItems = [].slice.call(
        document.querySelectorAll('#navbarResponsive .nav-link')
    );
    responsiveNavItems.map(function (responsiveNavItem) {
        responsiveNavItem.addEventListener('click', () => {
            if (window.getComputedStyle(navbarToggler).display !== 'none') {
                navbarToggler.click();
            }
        });
    });

    // Activate SimpleLightbox plugin for portfolio items
    new SimpleLightbox({
        elements: '#portfolio a.portfolio-box'
    });

    // 참고 : https://wiken.io/b/293/2
    function FaqBox__init() {
        $('.faq-box > ul > li').click(function() {
            let $this = $(this);

            $this.siblings('.hover').find(' > .faq-box__answer').stop().slideUp(300);
            $this.siblings('.hover').removeClass('hover');

            if ( $this.hasClass('hover') ) {
            $this.find(' > .faq-box__answer').stop().slideUp(300);
            $this.removeClass('hover');
            }
            else {
            $this.find(' > .faq-box__answer').stop().slideDown(300);
            $this.addClass('hover');
            }
        });

        $('.faq-box__answer').click(function() {
            return false;
        });
    }

    FaqBox__init();

});

function sendMail(){
    if (document.contactForm.name.value == "") {
        alert("이름을 입력해주세요.");
        document.contactForm.name.focus();
        return null;
    } else if (document.contactForm.email.value == "") {
        alert("이메일을 입력해주세요.");
        document.contactForm.email.focus();
        return null;
    } else if (document.contactForm.phone.value == "") {
        alert("연락처를 입력해주세요.");
        document.contactForm.phone.focus();
        return null;
    } else if (document.contactForm.message.value == "") {
        alert("기초사양을 입력해주세요.");
        document.contactForm.message.focus();
        return null;
    } else {
         var params = {
             from_name: document.getElementById("name").value,
             email_id: document.getElementById("email").value,
             message: document.getElementById("message").value,
             phone: document.getElementById("phone").value,

         };
         emailjs.send("service_2uzb04c", "template_3br2c18", params).then(function (res) {
         alert("견적 문의가 완료되었습니다.");
        })
    }
}

window.addEventListener('DOMContentLoaded', function() {
  var content = document.getElementById('content');
  var footer = document.getElementById('footer');

  var hasScroll = content.scrollHeight > content.clientHeight;
  if (hasScroll) {
    footer.style.display = 'none';

    content.addEventListener('scroll', function() {
      if (content.scrollTop + content.clientHeight >= content.scrollHeight) {
        footer.style.display = 'block';
      } else {
        footer.style.display = 'none';
      }
    });
  } else {
    footer.style.display = 'block';
  }
});