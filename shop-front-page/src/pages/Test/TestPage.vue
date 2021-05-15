<template>

</template>
<script>
import {TestJS} from "./test";

export default {
  name: 'TestPage',
  mounted() {
    TestJS.init();
  }
}

</script>