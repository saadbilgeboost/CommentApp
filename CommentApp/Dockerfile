# önce jdk gerekli olduğu için kullanacağımız jdk imajını indiriyoruz
FROM amazoncorretto:18.0.2
# jar dosyasını elle belirmek için argüman talep edeceğiz.
ARG JAR_FILE=target/*.jar
# jar dosyasını / root klasörüne kopyalıyoruz
COPY ${JAR_FILE_NASILSIN} app.jar
# app uygulamamızın çalışmasını sağlıyoruz.
ENTRYPOINT ["java","-jar","app.jar"]