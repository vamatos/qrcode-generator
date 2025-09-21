package br.com.vandre.qrcode.generator.ports;

public interface StoragePort {
    String upload(byte[] data, String filename, String contentType);
}
