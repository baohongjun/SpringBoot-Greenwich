#基础镜像jdk1.8
FROM java:8
#系统编码
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8
# VOLUME 指定了临时文件目录为/tmp
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为eureka-client.jar，这个是你maven打包后的jar包名
ADD eureka-client-0.0.1-SNAPSHOT.jar eureka-client.jar
#启动容器时的进程
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-client.jar"]
#暴露8762端口
EXPOSE 8762