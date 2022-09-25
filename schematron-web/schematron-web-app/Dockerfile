FROM "node:lts-alpine3.16"
ADD ./src/main/resources /var/www
WORKDIR '/var/www'
run npm install -g npm@latest
RUN npm install -g @eui/cli@latest >> /dev/null
RUN yarn install --verbose >> /dev/null
RUN yarn add @eui/dynamic-forms >> /dev/null
CMD ["npm", "run", "start"]