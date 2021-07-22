FROM frolvlad/alpine-java:jdk8-slim
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo '$TZ' > /etc/timezone
VOLUME /tmp
ADD target/demo-2-0.0.1-SNAPSHOT.jar test.jar
#解决图片字符乱码问题
#COPY demo-2/target/classes/msyh.ttf /usr/share/fonts/msyh.ttf
EXPOSE 10011
#ENTRYPOINT ["java", "-Xmx512m","-Xms512m", "-XX:NewRatio=1", "-XX:MetaspaceSize=128m", "-XX:MaxMetaspaceSize=512m", "-XX:+AlwaysPreTouch", "-XX:+UseConcMarkSweepGC", "-XX:CMSInitiatingOccupancyFraction=75", "-XX:+UseCMSInitiatingOccupancyOnly", "-XX:+ExplicitGCInvokesConcurrent", "-XX:+ParallelRefProcEnabled", "-XX:+CMSParallelInitialMarkEnabled", "-XX:MaxTenuringThreshold=3", "-XX:+UnlockDiagnosticVMOptions", "-XX:ParGCCardsPerStrideChunk=1024", "-XX:ParallelGCThreads=2", "-XX:ConcGCThreads=1", "-Xloggc:/dev/shm/gc.log", "-XX:+PrintGCDetails", "-XX:+PrintGCDateStamps", "-XX:+PrintPromotionFailure", "-XX:+PrintGCApplicationStoppedTime",  "-Djava.security.egd=file:/dev/./urandom", "-XX:+PrintCommandLineFlags", "-XX:-OmitStackTraceInFastThrow", "-XX:ErrorFile=/logs/hs_err_%p.log", "-jar", "test.jar","-Djava.awt.headless=true"]
ENTRYPOINT ["java", "-XX:ErrorFile=/logs/hs_err_%p.log", "-jar", "test.jar"]