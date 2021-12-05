import axios from "axios";

/*
This class links backend to the frontend
*/
const instance = axios.create({
    baseURL: 'http://localhost:8080',
    headers: {
        'Access-Control-Allow-Origin' : '*'
    }
})

export default instance;