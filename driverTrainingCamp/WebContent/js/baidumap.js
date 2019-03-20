/**
 * 
 */

var map = new BMap.Map("google-map");    
var point = new BMap.Point(118.193195,24.488561);    
map.centerAndZoom(point, 15);    
var marker = new BMap.Marker(point);        // 创建标注    
map.addOverlay(marker);    