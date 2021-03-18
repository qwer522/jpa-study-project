const path = require('path')

module.exports = {
    outputDir: path.resolve(__dirname,"../" + "shop-front/src/main/resources/static"),
    devServer: {
        // proxy: {
        //     '/api':{
        //         target: 'http://localhost:8083',
        //         ws: true,
        //         changeOrigin: true
        //     },
        // }
    }
}