SUMMARY = "helloworld recipe"
DESCRIPTION = "This is the recipe for the helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://go.googlesource.com/example;branch=master;protocol=https;destsuffix=${GO_SRCURI_DESTSUFFIX}"
SRCREV = "8b405629c4a5215871be932097e099c05ec5cb2e"
UPSTREAM_CHECK_COMMITS = "1"

GO_IMPORT = "github.com/anton-soenderskov/yocto-project/helloworld"
# GO_INSTALL IS SET TO DEFAULT: GO_INSTALL ?= "${GO_IMPORT}/..."

export GO111MODULE = "off"

inherit go

do_install:append() {
    mv ${D}${bindir}/helloworld ${D}${bindir}/${BPN}
}



