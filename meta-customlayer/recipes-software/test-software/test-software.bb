SUMMARY = "A simple Go application for testing"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit go

# The Go module's import path, from your go.mod file
GO_IMPORT = "test-software"

SRC_URI = "file://main.go \
           file://go.mod \
          "
GO_SRC = "${S}"

# Specify the output binary name
BIN_NAME = "test-software"

# Package the built binary to the standard bindir
FILES_${PN} = "${bindir}/${BIN_NAME}"
