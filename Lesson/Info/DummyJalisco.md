# DummyJalisco
A collection of methods to create a dummy Jalisco card 
The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public static void main(String[] args)        |Connects to blank card and creates a Jalisco App with it files|

JaliscoApp -> 0x484000
           -> 14 keys
           -> AES-128

|ID  |NAME   |TYPE    |SIZE |COMMS|AC|LOWER_L|UPPER_L|VALUE|RECORDS|
|:---|:------|:-------|:----|:------------|:----------------|:----------|:----------|:---------|:------|
|0x01|Emision|Standard|48   |MAC          |F, N, 1, 0       |N/A        |N/A        |N/A       |N/A    |
|0x02|Entorno|Standard|24   |MAC          |F, N, 1, 0       |N/A        |N/A        |N/A       |N/A    |
|0x03|Usuario|Standard|96   |MAC          |F, N, 1, 0       |N/A        |N/A        |N/A       |N/A    |
|0x04|Estado |Backup  |23   |MAC          |F, N, 1, 0       |N/A        |N/A        |N/A       |N/A    |
|0x05|ListaProd|Backup|57   |MAC          |F, N, 2, 0       |N/A        |N/A        |N/A       |N/A    |
|0x06|Eventos|Ciclicco|64   |MAC          |F, N, 2, 0       |N/A        |N/A        |N/A       |10     |
|0x07|ContMon|Standard|72   |MAC          |F, N, 3, 0       |N/A        |N/A        |N/A       |N/A    |
|0x08|ServMon|Backup  |23   |MAC          |F, N, 2, 0       |N/A        |N/A        |N/A       |N/A    |
|0x09|ValueMon|Value  |N/A  |MAC          |N, 2, 3, 0       |0          |1000000    |0         |N/A    |
|0x0A|ContCre|Standard|72   |MAC          |F, N, 3, 0       |N/A        |N/A        |N/A       |N/A    |
|0x0B|ServBPD|Backup  |23   |MAC          |F, N, 2, 0       |N/A        |N/A        |N/A       |N/A    |
|0x0C|ValueCre|Value  |N/A  |MAC          |N, 2, 3, 0       |-1000      |0          |0         |N/A    |
|0x0D|ContBPD|Standard|72   |MAC          |F, N, 3, 0       |N/A        |N/A        |N/A       |N/A    |
|0x0E|ServBPD|Backup  |23   |MAC          |F, N, 2, 0       |N/A        |N/A        |N/A       |N/A    |
|0x0F|ValueBPD|Value  |N/A  |MAC          |N, 2, 3, 0       |0          |1000000    |0         |N/A    |
