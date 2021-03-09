import {
    HomePage,
    ShopPage,
    LoginPage,
    SignUpPage,
} from '../pages';

export const routes = [
    {
        path: '/',
        name: 'home',
        component: HomePage
    },
    {
        path: '/shop',
        name: 'shop',
        component: ShopPage
    },
    {
        path: '/login',
        name: 'login',
        component: LoginPage
    },
    {
        path: '/signup',
        name: 'signup',
        component: SignUpPage
    },
];
