let proxy_target = process.env.BACKEND_PROXY_TARGET;
module.exports = {
  devServer: {
    proxy: {
      "^/book": { target: proxy_target }
    },
    port: process.env.DEV_SERVER_PORT
  }
};
