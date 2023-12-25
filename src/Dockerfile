FROM registry.access.redhat.com/ubi8/openjdk-17-runtime:1.18-2

ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'

VOLUME /tmp
ARG JAR_FILE
ARG VERSION
ARG MODULENAME
ENV TAG=$VERSION
ENV MODULE=$MODULENAME

COPY --chown=185 target/${JAR_FILE} /deployments/app.jar
COPY --chown=185 ./docker-entrypoint.sh /

EXPOSE 7000
USER 185

ENV JAVA_OPTS=""
ENV JAVA_APP_JAR=""

CMD java \
         -Xmx64m \
         -Djava.security.egd=file:/dev/./urandom \
         -jar /deployments/app.jar
