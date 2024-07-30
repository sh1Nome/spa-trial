FROM node:22-slim

ENV NODE_ENV=development
ENV NPM_CONFIG_LOGLEVEL=info

RUN npm install -g npm@10.8.2

USER node

WORKDIR /home/node/vue-project

ENTRYPOINT [ "tail", "-f", "/dev/null" ]