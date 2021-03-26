import axios from "axios";

const MEMBER_BASE_PATH = 'product';

export const read = () => axios.get(MEMBER_BASE_PATH + '')
    .then(({data}) => data.result);
export const getProduct = (id) => axios.get(MEMBER_BASE_PATH + '/'+id)
    .then(({data}) => data.result);
