SUMMARY = "helloworld recipe"
DESCRIPTION = "This is the recipe for the helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://go.mod \
           file://main.go"

S = "${WORKDIR}"

GO_IMPORT = "helloworld"
GO_INSTALL = "${GO_IMPORT}"

inherit go-mod

do_compile() {
    cd ${S}
    ${GO} build -o helloworld main.go
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/helloworld ${D}${bindir}/${BPN}
}



