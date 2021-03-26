import {
    create,
    login
} from '../../service/member/memberApiService'


export default{
    namespaced: true,
    state: {
        member: [],
    },
    mutations: {
        //로그인 성공시
        loginSuccess(state, user){
            state.user = user;
        },
        //로그인 실패시
        loginError(state){

        },
        logout(state){
            state.user = null;
        },
        boardDetail(state, board){
            state.boardDetail = board;
        },
        //회원가입
        setSignup(state){

        }
    },
    actions: {
        async create({commit}, signupObj){
            await create(signupObj);
        },
        async login({commit}, loginObg){
            const response = await login(loginObg);
            commit("loginSuccess", response.data);
        }
    },
    modules: {}
};
