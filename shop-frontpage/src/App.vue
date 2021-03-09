<template>
  <div id="app" >
    <Header />
    <router-view/>
    <Footer />
  </div>
</template>
<script>
import Header from "@/components/Header";
import Footer from "@/components/Footer";

export default {
  mounted() {
    $.initialize();

  },
  components: {
    Header,
    Footer
  }
}
</script>