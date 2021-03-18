import Http from "@/api/http";

const MEMBER_BASE_PATH = 'api/member';

export const create = (data) => Http.post(MEMBER_BASE_PATH, data)
    .then(({data}) => data)
export const login = (data) => Http.post('' +
    '/login', data)
    .then(({data}) => data)
