<template>
<div class="page-wrapper">
    <SlideBanner />
    <FeaturedProduct />
    <BestProduct />
    <Category />

      <section class="cta-section">
        <div class="container-1410">
          <div class="row">
            <div class="col col-xs-12">
              <div class="content-area">
                <span>Trending</span>
                <h3>트랜딩</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolores nisi distinctio magni,
                  iure deserunt doloribus optio</p>
                <a href="shop.html" class="theme-btn-s2">트랜딩</a>
              </div>
            </div>
          </div>
        </div>
      </section>


    <Instagram />

</div>
</template>

<script>
import SlideBanner from "@/pages/home/components/SlideBanner";
import FeaturedProduct from "@/pages/home/components/FeaturedProduct";
import BestProduct from "@/pages/home/components/BestProduct";
import Category from "@/pages/home/components/Category";
import Instagram from "@/pages/home/components/Instagram";

export default {
  name: 'HomePage',
  components: {
    SlideBanner,
    FeaturedProduct,
    BestProduct,
    Category,
    Instagram
  },
}
</script>
