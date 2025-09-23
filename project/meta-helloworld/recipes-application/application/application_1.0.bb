SUMMARY = "A simple Go application that prints a greeting"
DESCRIPTION = "A Yocto recipe for a 'Hello World' style Go application."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://go.mod \
           file://main.go"

S = "${UNPACKDIR}"

GO_IMPORT = "helloworld"

inherit go

do_compile() {
    cd ${S}
    ${GO} build -trimpath -ldflags="-buildid=" -o ${B}/application .
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/application ${D}${bindir}/application
}

FILES:${PN} = "${bindir}/application"
