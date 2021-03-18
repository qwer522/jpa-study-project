<template>
  <div>
    <Category />

    <!-- start shop-section -->
    <section class="shop-section section-padding">
      <div class="container-fluid">
        <div class="row">
          <div class="col col-xs-12">
            <div class="shop-area clearfix">
              <div class="woocommerce-content-wrap">
                <Product />
                <Pagination />
              </div>

              <div class="shop-sidebar">
                <Search />
                <PriceFilter />
                <ProductCategory />
                <ColorFilter />
                <ProductTag />
              </div>
            </div>
          </div>
        </div>
      </div> <!-- end container -->
    </section>
    <!-- end shop-section -->
  </div>
</template>
<script>
import { ShopPageJS } from "../../../public/js/shop/shopPage";
import Category from "@/components/home/Category";
import Search from "@/components/shop/Search";
import PriceFilter from "@/components/shop/PriceFilter";
import ProductCategory from "@/components/shop/ProductCategory";
import ColorFilter from "@/components/shop/ColorFilter";
import ProductTag from "@/components/shop/ProductTag";
import Product from "@/components/shop/Product";
import Pagination from "@/components/shop/Pagination";

export default {
  name:'ShopPage',
  components: {
    Category,
    Search,
    PriceFilter,
    ProductCategory,
    ColorFilter,
    ProductTag,
    Product,
    Pagination
  },
  mounted() {
    ShopPageJS.init();
  }

}
</script>