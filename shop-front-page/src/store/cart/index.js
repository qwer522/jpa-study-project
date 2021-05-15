import {
    insertCart,
    getCarts,
} from '../../service/cart/cartApiService'


export default{
    namespaced: true,
    state: {
        carts: [

        ],
    },
    getters: {
        getCarts(){
            return this.state.carts;
        }
    },
    mutations: {
        insertCart(state, carts){
            state.carts = carts;
        }
    },
    actions: {
        async insertCart({commit}, cartObj){
            const response = await insertCart(cartObj);
            commit("insertCart",response);
        },
        async read({commit},id){
            const response = await getCarts(id);
            commit("insertCart",response);
        }
    },
    modules: {}
};