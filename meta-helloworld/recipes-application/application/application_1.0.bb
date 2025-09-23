SUMMARY = "helloworld recipe"
DESCRIPTION = "This is the recipe for the helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/anton-soenderskov/yocto-project.git;protocol=https;branch=main"
SRCRC = "fa63cc92aecded91e644fe109ad71a1fa84ad302"

GO_IMPORT = "github.com/anton-soenderskov/yocto-project"
# GO_INSTALL IS SET TO DEFAULT: GO_INSTALL ?= "${GO_IMPORT}/..."

export GO111MODULE = "off"

inherit go

do_install:append() {
    mv ${D}${bindir}/helloworld ${D}${bindir}/${BPN}
}



