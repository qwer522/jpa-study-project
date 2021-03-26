import {
    read,
    getProduct
} from '../../service/product/productApiService'


export default{
    namespaced: true,
    state: {
        products: [],
        product: [],
        bestProducts: [],
    },
    getter: {
      getProducts(){
          return this.state.products;
      }
    },
    mutations: {
        getProducts(state, products){
            state.products = products;
        },
        getProduct(state, product){
            state.product = product;
        }
    },
    actions: {
        async read({commit}){
            const response = await read();
            commit("getProducts", response);
        },
        async getProduct({commit},id){
            const response = await getProduct(id);
            commit("getProduct", response);
        }


    },
    modules: {}
};
