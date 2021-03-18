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
import SlideBanner from "@/components/home/SlideBanner";
import FeaturedProduct from "@/components/home/FeaturedProduct";
import BestProduct from "@/components/home/BestProduct";
import Category from "@/components/home/Category";
import Instagram from "@/components/home/Instagram";

export default {
  name: 'HomePage',
  components: {
    SlideBanner,
    FeaturedProduct,
    BestProduct,
    Category,
    Instagram
  },
  mounted() {
    // $.initialize().slider();
  }
}
</script>
