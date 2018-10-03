package com.example.anastasiakruglova.mytestplayer.service;

class TransportHolder {
        private static TransportService instance;

        static TransportService getServiceInstance() {
            synchronized (TransportHolder.class) {
                if (instance == null) {
                    instance = Transport.hostInstance();
                }
            }
            return instance;
        }
}
