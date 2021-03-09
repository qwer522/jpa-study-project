<template>
  <header id="header" class="site-header header-style-1">
    <nav class="navigation navbar navbar-default">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="open-btn">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <router-link :to="{name: 'home'}" tag="div" exact>
            <a class="navbar-brand"><img src="images/logo.png" alt></a>
          </router-link>
<!--          <a class="navbar-brand" href="index.html"><img src="../assets/images/logo.png" alt></a>-->
        </div>
        <div class="header-left">
          <div class="side-info-bars">
            <span></span>
            <span></span>
            <span></span>
          </div>
          <div class="side-info-content">
            <button class="btn side-info-close-btn"><i class="ti-close"></i></button>
            <div class="logo">
              <img src="images/slidbar-logo.png" alt>
            </div>
            <div class="text">
              <p>Covered the whole of her lower arm towards the viewer gregor then turned to look out
                the window</p>
              <ul class="info">
                <li>Contact us: ++8801682530219</li>
                <li>Mail us: eoard@gmail.com</li>
              </ul>
              <ul class="social-links">
                <li><a href="https://m.facebook.com/?locale2=ko_KR" target="_blank"><i class="ti-facebook"></i></a></li>
                <li><a href="#"><i class="ti-twitter-alt"></i></a></li>
                <li><a href="#"><i class="ti-pinterest"></i></a></li>
                <li><a href="#"><i class="ti-vimeo-alt"></i></a></li>
              </ul>
            </div>
          </div>
          <div class="search-area">
            <form>
              <button type="submit"><i class="fi flaticon-search"></i></button>
              <input type="text" placeholder="Search for..">
            </form>
          </div>
        </div>
        <div id="navbar" class="navbar-collapse collapse navigation-holder">
          <button class="close-navbar"><i class="ti-close"></i></button>
          <ul class="nav navbar-nav">
            <router-link :to="{name:'home'}" tag="li" active-class="menu-item-has-children current-menu-parent" exact>
              <a>Home</a>
            </router-link>
            <li class="menu-item-has-children has-mega-menu">
              <a href="#">Shop</a>
              <ul class="mega-menu">
                <li>
                  <div class="mega-menu-content">
                    <div class="col col-5">
                      <span class="mega-menu-box-title">Shop style</span>
                      <ul class="mega-menu-list-holder">
                        <li><a href="shop.html">Shop left sidebar</a></li>
                        <li><a href="shop-right-sidebar.html">Shop right sidebar</a></li>
                        <li><a href="shop-2.html">Shop full width</a></li>
                      </ul>
                    </div>
                    <div class="col col-5">
                      <span class="mega-menu-box-title">Shop single</span>
                      <ul class="mega-menu-list-holder">
                        <li><a href="shop-single.html">Horizental thumbnail</a></li>
                        <li><a href="shop-single-vertical-thumbnail.html">Vertical
                          thumbnail</a></li>
                      </ul>
                    </div>
                    <div class="col col-5">
                      <span class="mega-menu-box-title">Product style</span>
                      <ul class="mega-menu-list-holder">
                        <li><a href="shop.html">Product style 1</a></li>
                        <li><a href="shop-right-sidebar.html">Product style 2</a></li>
                        <li><a href="shop-2.html">Product style 3</a></li>
                      </ul>
                    </div>
                    <div class="col col-5">
                      <span class="mega-menu-box-title">Other pages</span>
                      <ul class="mega-menu-list-holder">
                        <li><a href="cart.html">Cart</a></li>
                        <li><a href="checkout.html">Checkout</a></li>
                        <li><a href="my-account.html">My account</a></li>
                      </ul>
                    </div>
                    <div class="col col-5">
                      <span class="mega-menu-box-title">Other pages</span>
                      <ul class="mega-menu-list-holder">
                        <li><a href="cart.html">Cart</a></li>
                        <li><a href="checkout.html">Checkout</a></li>
                        <li><a href="my-account.html">My account</a></li>
                      </ul>
                    </div>
                  </div>
                </li>
              </ul>
            </li>
            <li class="menu-item-has-children">
              <a href="#">Pages</a>
              <ul class="sub-menu">
                <li><a href="404.html">404</a></li>
                <li><a href="about.html">About</a></li>
                <li><a href="contact.html">Contact</a></li>

              </ul>
            </li>
            <li class="menu-item-has-children">
              <a href="#">Blog</a>
              <ul class="sub-menu">
                <li><a href="blog.html">Blog</a></li>
                <li><a href="blog-masonary.html">Blog masonry</a></li>
                <li><a href="blog-single.html">Blog single</a></li>
              </ul>
            </li>
            <li><a href="contact.html">Contact</a></li>
            <li><a href="index-rtl.html">RTL</a></li>
          </ul>
        </div><!-- end of nav-collapse -->
        <div class="header-right">
          <router-link :to="{name: 'login'}" active-class="my-account-link" tag="div" exact>
            <a><i class="icon-user"></i></a>
          </router-link>
<!--          <div class="my-account-link">-->
<!--            <a href="my-account.html"><i class="icon-user"></i></a>-->
<!--          </div>-->
          <div class="wishlist-box">
            <a href="#"><i class="icon-heart-shape-outline"></i></a>
          </div>
          <div class="mini-cart">
            <button class="cart-toggle-btn"> <i class="icon-large-paper-bag"></i> <span
                class="cart-count">3</span></button>
            <div class="mini-cart-content">
              <div class="mini-cart-items">
                <div class="mini-cart-item clearfix">
                  <div class="mini-cart-item-image">
                    <a href="shop-single.html"><img src="images/shop/mini-cart/img-1.jpg"
                                                    alt></a>
                  </div>
                  <div class="mini-cart-item-des">
                    <a href="shop-single.html">Elegant skirt</a>
                    <span class="mini-cart-item-quantity">Qty: 1</span>
                    <span class="mini-cart-item-price">$20.15</span>
                  </div>
                </div>
                <div class="mini-cart-item clearfix">
                  <div class="mini-cart-item-image">
                    <a href="shop-single.html"><img src="images/shop/mini-cart/img-2.jpg"
                                                    alt></a>
                  </div>
                  <div class="mini-cart-item-des">
                    <a href="shop-single.html">Beautiful tops</a>
                    <span class="mini-cart-item-quantity">Qty: 1</span>
                    <span class="mini-cart-item-price">$13.25</span>
                  </div>
                </div>
              </div>
              <div class="mini-cart-action clearfix">
                <span class="mini-checkout-price">Subtotal: $215.14</span>
                <a href="cart.html" class="view-cart-btn">View Cart</a>
                <a href="checkout.html" class="checkout-btn">Checkout</a>
              </div>
            </div>
          </div>
        </div>
      </div><!-- end of container -->
    </nav>
  </header>
</template>
<script>
export default {
  mounted() {
    // $.initialize().shoppingCartToggle();
  }
}
</script>