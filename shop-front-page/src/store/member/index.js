import router from '@/router';
import Axios from 'axios';
import {
    create,
    login
} from '../../service/member/memberApiService'


export default{
    namespaced: true,
    state: {
        userInfo: null,
        isLogin: false,
        isLoginError: false,
        boardList: [],
        boardDetail: null,
    },
    mutations: {
        //로그인 성공시
        loginSuccess(state, payload){
            state.isLogin = true
            state.isLoginError = false
            state.userInfo = payload
        },
        //로그인 실패시
        loginError(state){
            state.isLogin = false
            state.isLoginError = true
        },
        logout(state){
            state.isLogin = false
            state.isLoginError = false
            state.userInfo = null
        },
        boardDetail(state, board){
            state.boardDetail = board
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
            commit("loginSuccess", response.data)
        }
    },
    modules: {}
};
