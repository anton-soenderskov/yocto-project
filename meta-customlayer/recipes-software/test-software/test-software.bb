SUMMARY = "A simple Go application for testing"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit go-mod

GO_IMPORT = "test-software"
BIN_NAME = "test-software"

SRC_URI = "file://src/"
S = "${WORKDIR}/src"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/bin/${BIN_NAME} ${D}${bindir}/
}

FILES:${PN} = "${bindir}/${BIN_NAME}"

