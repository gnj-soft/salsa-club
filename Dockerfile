FROM java:8

EXPOSE 8080

COPY . /usr/src/myapp
WORKDIR /usr/src/myapp

CMD ["java", "Main"]