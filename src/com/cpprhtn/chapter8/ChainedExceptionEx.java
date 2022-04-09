package com.cpprhtn.chapter8;

public class ChainedExceptionEx {
    public static void main(String args[]) {
        try {
            install();
        } catch(InstallException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e)	{
            InstallException ie = new InstallException("설치중 예외발생");
            ie.initCause(e);
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace()) { 		// 충분한 설치 공간이 없으면...
            throw new SpaceException("설치할 공간이 부족합니다.");
        }

        if (!enoughMemory()) {		// 충분한 메모리가 없으면...
            throw new MemoryException("메모리가 부족합니다.");
//		throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
        }
    } // startInstall메서드의 끝

    static void copyFiles() { /* ... */ }
    static void deleteTempFiles() { /* ... */}

    static boolean enoughSpace()   {
        // 설치하는데 필요한 공간이 있는지 확인하는 코드 write.
        return false;
    }
    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리공간이 있는지 확인하는 코드 write.
        return true;
    }
}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
