FROM "node:lts-alpine3.16"

WORKDIR /var/www
RUN npm install -g npm@latest
RUN npm install -g @eui/cli@latest
RUN yarn install
RUN yarn add @eui/dynamic-forms
RUN chown -R 138905:66049 "/root/.npm"
EXPOSE 4200
CMD ["npm", "run", "start"]