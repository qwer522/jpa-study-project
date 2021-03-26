import {
    read
} from '../../service/cart/cartApiService'


export default{
    namespaced: true,
    state: {
        carts: [],
    },
    getter: {
        getCarts(){
            return this.state.carts;
        }
    },
    mutations: {
        getCarts(state, carts){
            state.carts = carts;
        }
    },
    actions: {
        async read({commit}){
            const response = await read();
            commit("getCarts", response);
        },
    },
    modules: {}
};
