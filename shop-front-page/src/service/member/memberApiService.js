import Http from "@/api/http";

const MEMBER_BASE_PATH = 'member';

export const create = (data) => Http.post(MEMBER_BASE_PATH + '/signup', data)
    .then(({data}) => data)
export const login = (data) => Http.post('' +
    '/login', data)
    .then(({data}) => data)
