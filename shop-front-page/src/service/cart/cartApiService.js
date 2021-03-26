import axios from "axios";

const MEMBER_BASE_PATH = 'cart';

export const read = () => axios.get(MEMBER_BASE_PATH + '')
    .then(({data}) => data.result);
