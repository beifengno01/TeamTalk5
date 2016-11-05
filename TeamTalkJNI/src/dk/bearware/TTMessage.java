/*
 * Copyright (c) 2005-2016, BearWare.dk
 * 
 * Contact Information:
 *
 * Bjoern D. Rasmussen
 * Kirketoften 5
 * DK-8260 Viby J
 * Denmark
 * Email: contact@bearware.dk
 * Phone: +45 20 20 54 59
 * Web: http://www.bearware.dk
 *
 * This source code is part of the TeamTalk 5 SDK owned by
 * BearWare.dk. All copyright statements may not be removed 
 * or altered from any source distribution. If you use this
 * software in a product, an acknowledgment in the product 
 * documentation is required.
 *
 */

package dk.bearware;

public class TTMessage
{
    public int nClientEvent;
    public int nSource;
    public int ttType;

    public Channel channel;
    public ClientErrorMsg clienterrormsg;
    public DesktopInput desktopinput;
    public FileTransfer filetransfer;
    public MediaFileInfo mediafileinfo;
    public RemoteFile remotefile;
    public ServerProperties serverproperties;
    public ServerStatistics serverstatistics;
    public TextMessage textmessage;
    public User user;
    public UserAccount useraccount;
    public BannedUser banneduser;
    public boolean bActive;
    public int nBytesRemain;
    public int nStreamID;
    public int nPayloadSize;
    public int nStreamType;

    public TTMessage() { }
}
