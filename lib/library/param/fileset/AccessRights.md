# AccessRights
Provides an encapsulation for the files' access rights.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public AccessRights()|Creates a default instance of class <code>AccessRights</code>|
|public AccessRights(int readAccess, int writeAccess, int readWriteAccess, int changeAccessRights)|Creates an instance of class <code>AccessRights</code> @param readAccess an int indicating the read access right @param writeAccess an int indicating the write access right @param readWriteAccess an int indicating the read & write access right @param changeAccessRights an int indicating the access right necessary to modify the other access rights|
|public AccessRights(byte[] accessRights)|Creates an instance of class <code>AccessRights</code> @param accessRights a byte array representing all the access rights|
|public int getReadAccess()|@return an int indicating the current read access right|
|public int getWriteAccess()|@return an int indicating the current write access right|
|public int getReadWriteAccess()|@return an int indicating the current read & write access right|
|public int getChangeAccessRights()|@return an int indicating the current access right necessary to modify the other access rights|
|private void setReadAccess(byte[] accessRights)|@return an byte array containing the new access rights|
|public void setReadAccess(int readAccess)|@param readAccess an int indicating the new read access right|
|private void setWriteAccess(byte[] accessRights)|@return an byte array containing the new access rights|
|public void setWriteAccess(int writeAccess)|@param writeAccess an int indicating the new write access right|
|private void setReadWriteAccess(byte[] accessRights)|@return an byte array containing the new access rights|
|public void setReadWriteAccess(int readWriteAccess)|@param readWriteAccess an int indicating the new read & write access right|
|private void setChangeAccessRights(byte[] accessRights|@return an byte array containing the new access rights|
|public void setChangeAccessRights(int changeAccessRights)|@param changeAccessRights an int indicating the new access right necessary to modify the other access rights|
|public byte[] toBA()|@return the byte array representation of the current access rights|
|public static byte[] toBA(AccessRights accessRights)|Obtains the byte array representation of the given access rights @param accessRights an instance of class <code>AccessRights</code> @return the byte array representation of <code>accessRights</code>|
