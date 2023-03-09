Feature:  Application Test

Scenario Outline: Login 

Given user open browser
Then user enter data from sheetname "<SheetName>" and rownumber <RowNumber>
Then user clicks login button

Examples:
|SheetName|RowNumber|
|Login|0|
|Login|1|