SUMMARY = "A simple Go application that creates a server"
DESCRIPTION = "A Yocto recipe for a 'ping-pong' server"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/anton-soenderskov/server_for_yocto.git;branch=main;protocol=https;destsuffix=${GO_SRCURI_DESTSUFFIX}"
SRCREV = "e069969dd72e640b89eed156f1a9efcd671a5ce8"
UPSTREAM_CHECK_COMMITS = "1"

# S must be set to UNPACKDIR for git sources
S = "${UNPACKDIR}/git"

# GO_IMPORT is the mandatory variable that sets the package's import path
GO_IMPORT = "github.com/anton-soenderskov/server_for_yocto"

# GO_INSTALL is not needed. The default value of "${GO_IMPORT}/..." is
# sufficient and correct for building all sub-packages.

inherit go-mod

# No do_compile() override is needed. The default from go.bbclass is used.
# No do_install() override is needed. The default from go.bbclass is used.

# FILES:${PN} is not needed. The default packaging logic from go.bbclass
# correctly places the binary from ${bindir} into the main package.

