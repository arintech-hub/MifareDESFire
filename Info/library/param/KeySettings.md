# KeySettings
Provides an encapsulation to a key settings structure.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public KeySettings()|Creates a default key settings instance|
|public KeySettings(int changeKeyAccessRights, boolean configurationChangeable, boolean freeCreateDelete, boolean freeDirectoryListAccess, boolean allowChangingMasterKey)|Creates an instance of class <code>KeySettings</code> @param changeKeyAccessRights an int indicating the key to authenticate with to obtain permission to subsequent change keys operations @param configurationChangeable a boolean indicating whether the current application configuration is changeable or not @param freeCreateDelete a boolean indicating whether applications or files can be created and/or deleted without previous authentication @param freeDirectoryListAccess a boolean indicating whether application or file identifiers can be listed without previous authentication @param allowChangingMasterKey a boolean indicating whether the card or application master key can be modified|
|public KeySettings(boolean configurationChangeable, boolean freeCreateDelete, boolean freeDirectoryListAccess, boolean allowChangingMasterKey)|Creates an instance of class <code>KeySettings</code> @param configurationChangeable a boolean indicating whether the current application configuration is changeable or not @param freeCreateDelete a boolean indicating whether applications or files can be created and/or deleted without previous authentication @param freeDirectoryListAccess a boolean indicating whether application or file identifiers can be listed without previous authentication @param allowChangingMasterKey a boolean indicating whether the card or application master key can be modified|
|public KeySettings(byte[] keySettings)|Creates an instance of class <code>KeySettings</code> @param keySettings a byte array containing the key settings|
|public int getChangeKeyAccessRights()|@return an int indicating the key to authenticate with to obtain permission to subsequent change keys operations|
|public boolean getConfigurationChangeable()|@return <code>true</code> if the current application configuration is changeable; <code>false</code> otherwise|
|public boolean getFreeCreateDelete()|@return <code>true</code> if applications or files can be created and/or deleted without previous authentication; <code>false</code> otherwise|
|public boolean getFreeDirectoryListAccess()|@return <code>true</code> if application or file identifiers can be listed without previous authentication; <code>false</code> otherwise|
|public boolean getAllowChangingMasterKey()|@return <code>true</code> if the card or application master key can be modified; <code>false</code> otherwise|
|private void setChangeKeyAccessRights(byte[] keySettings)|@param keySettings a byte array containing the new key settings|
|public void setChangeKeyAccessRights(int changeKeyAccessRights)|@param changeKeyAccessRights an int indicating the key to authenticate with to obtain permission to subsequent change keys operations|
|private void setConfigurationChangeable(byte[] keySettings)|@param keySettings a byte array containing the new key settings|
|public void setConfigurationChangeable(boolean configurationChangeable)|@param configurationChangeable a boolean indicating whether the current application configuration is changeable or not|
|private void setFreeCreateDelete(byte[] keySettings)|@param keySettings a byte array containing the new key settings|
|public void setFreeCreateDelete(boolean freeCreateDelete)|@param freeCreateDelete a boolean indicating whether applications or files can be created and/or deleted without previous authentication|
|private void setFreeDirectoryListAccess(byte[] keySettings)|@param keySettings a byte array containing the new key settings|
|public void setFreeDirectoryListAccess(boolean freeDirectoryListAccess)|@param freeDirectoryListAccess a boolean indicating whether application or file identifiers can be listed without previous authentication|
|private void setAllowChangingMasterKey(byte[] keySettings)|@param keySettings a byte array containing the new key settings|
|public void setAllowChangingMasterKey(boolean allowChangingMasterKey)|@param allowChangingMasterKey a boolean indicating whether the card or application master key can be modified|
|public byte[] toBA()|@return the byte array representation of the current key settings|
    
