(this.webpackJsonpapp=this.webpackJsonpapp||[]).push([[0],{109:function(e,t,n){},167:function(e,t,n){},172:function(e,t,n){},273:function(e,t,n){"use strict";n.r(t);var c,a,r,i,o,s=n(0),l=n.n(s),d=n(20),j=n.n(d),b=(n(109),n(33)),h=n.n(b),u=n(54),m=n(14),O=n(1),p=n(4),x=n(32),f=n(29),g=Object(f.a)(c||(c=Object(x.a)(["\n    body{\n        margin:0;\n        padding:0;\n        box-sizing:border-box;\n    }  \n"]))),y=f.b.div(a||(a=Object(x.a)(["\n    width: 1270px;\n    margin: 0 auto;\n"]))),w=n(5),v=n(277),k=n(280),C=n(286),I=n(283),P=n(278),S=n(139),N=(n(167),f.b.div(r||(r=Object(x.a)(["\n    display: flex;\n"])))),A=f.b.div(i||(i=Object(x.a)(["\n    img {\n        width: 350px;\n        height: 350px;\n    }\n"]))),z=f.b.div(o||(o=Object(x.a)(["\n    padding: 20px 20px;\n    margin: 0 auto;\n    h6 {\n        font-weight: normal;\n        font-size: 13px;\n    }\n    .price {\n        font-weight: bold;\n    }\n    .description {\n        font-size: 13px;\n    }\n"]))),H=n(2);function D(e){return Object(H.jsxs)(k.a,Object(O.a)(Object(O.a)({},e),{},{size:"lg","aria-labelledby":"contained-modal-title-vcenter",centered:!0,children:[Object(H.jsx)(k.a.Header,{children:Object(H.jsx)(k.a.Title,{id:"contained-modal-title-vcenter",children:"Are you sure to delete this item?"})}),Object(H.jsxs)(k.a.Footer,{children:[Object(H.jsx)(C.a,{onClick:e.handleDeleteItem,children:"Yes"}),Object(H.jsx)(C.a,{onClick:e.onHide,children:"No"})]})]}))}function T(e){var t=Object(s.useState)(e.currentItem),n=Object(p.a)(t,2),c=n[0],a=n[1];Object(s.useEffect)((function(){a(e.currentItem)}),[e]);var r=function(e){var t=e.target,n=t.name,r=t.value;a(Object(O.a)(Object(O.a)({},c),{},Object(w.a)({},n,r)))};return Object(H.jsxs)(k.a,Object(O.a)(Object(O.a)({},e),{},{size:"lg","aria-labelledby":"contained-modal-title-vcenter",centered:!0,children:[Object(H.jsx)(k.a.Header,{closeButton:!0,children:Object(H.jsx)(k.a.Title,{id:"contained-modal-title-vcenter",children:"Modal heading"})}),Object(H.jsxs)(I.a,{children:[Object(H.jsxs)(k.a.Body,{children:[Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalEmail",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Name"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",name:"name",value:c.name,onChange:r})})]}),Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalPassword",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Description"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",name:"description",value:c.description,onChange:r})})]}),Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalPassword",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Price"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",value:c.price,name:"price",onChange:r})})]}),Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalPassword",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Brand"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",name:"brand",value:c.brand,onChange:r})})]}),Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalPassword",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Amount"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",name:"amount",value:c.amount,onChange:r})})]}),Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalPassword",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Image Url"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",name:"imgUrl",value:c.imgUrl,onChange:r})})]})]}),Object(H.jsxs)(k.a.Footer,{children:[Object(H.jsx)(C.a,{onClick:function(){e.onHide(),e.updateItem(c.id,c)},children:"Update"}),Object(H.jsx)(C.a,{onClick:e.onHide,children:"Close"})]})]})]}))}function B(e){return Object(H.jsx)(k.a,Object(O.a)(Object(O.a)({},e),{},{size:"lg","aria-labelledby":"contained-modal-title-vcenter",centered:!0,children:Object(H.jsxs)(N,{children:[Object(H.jsx)(A,{children:Object(H.jsx)("img",{src:e.item.imgUrl,alt:""})}),Object(H.jsxs)(z,{children:[Object(H.jsx)("h4",{children:e.item.name}),Object(H.jsxs)("h6",{children:["Type: ",e.item.type]}),Object(H.jsx)("div",{className:"price",children:e.item.price+"$"}),Object(H.jsx)("div",{className:"description",children:e.item.description})]})]})}))}var F,L,G,U,_=function(e){for(var t=e.items,n=e.deleteItem,c=e.editRow,a=e.currentItem,r=e.updateItem,i=e.currentPage,o=e.pageSize,d=Object(s.useState)(),j=Object(p.a)(d,2),b=j[0],h=j[1],u=Object(s.useState)(),m=Object(p.a)(u,2),O=m[0],x=m[1],f=l.a.useState(!1),g=Object(p.a)(f,2),w=g[0],k=g[1],C=l.a.useState(!1),I=Object(p.a)(C,2),P=I[0],S=I[1],N=l.a.useState(!1),A=Object(p.a)(N,2),z=A[0],F=A[1],L=l.a.useState({}),G=Object(p.a)(L,2),U=G[0],_=G[1],E=[],R=(i-1)*o;R<(i-1)*o+o&&null!=t[R];R++)E.push(t[R]);return Object(H.jsx)(y,{children:Object(H.jsxs)(v.a,{striped:!0,bordered:!0,hover:!0,children:[Object(H.jsx)("thead",{children:Object(H.jsxs)("tr",{children:[Object(H.jsx)("th",{children:"ID"}),Object(H.jsx)("th",{children:"Name"}),Object(H.jsx)("th",{children:"Description"}),Object(H.jsx)("th",{children:"Price ($)"}),Object(H.jsx)("th",{children:"brand"}),Object(H.jsx)("th",{children:"Amount"})]})}),Object(H.jsxs)("tbody",{children:[E.map((function(e,t){return Object(H.jsxs)("tr",{children:[Object(H.jsx)("td",{style:{width:"10%"},children:e.id}),Object(H.jsx)("td",{style:{width:"15%"},className:"name",onClick:function(){F(!0),_(e)},children:e.name}),Object(H.jsx)("td",{style:{width:"30%"},children:e.description}),Object(H.jsx)("td",{style:{width:"10%"},children:e.price}),Object(H.jsx)("td",{style:{width:"10%"},children:e.brand}),Object(H.jsx)("td",{style:{width:"10%"},children:e.amount}),Object(H.jsx)("td",{style:{width:"8%"},children:Object(H.jsx)("div",{className:"btn-container btn",children:Object(H.jsx)("div",{className:"btn-edit center",onClick:function(){S(!0),c(e),x(e)},children:"Edit"})})}),Object(H.jsx)("td",{style:{width:"7%"},children:Object(H.jsx)("div",{className:"btn-container btn",children:Object(H.jsx)("div",{className:"btn-delete center",onClick:function(){k(!0),h(e.id)},children:"Delete"})})})]},t)})),Object(H.jsx)(T,{show:P,onHide:function(){return S(!1)},item:O,currentItem:a,updateItem:r}),Object(H.jsx)(D,{show:w,onHide:function(){return k(!1)},handleDeleteItem:function(){k(!1),n(b)}}),Object(H.jsx)(B,{show:z,onHide:function(){return F(!1)},item:U})]})]})})},E=(n(171),f.b.div(F||(F=Object(x.a)(["\n    background-color: #1a94ff;\n"])))),R=f.b.div(L||(L=Object(x.a)(["\n    display: flex;\n    padding: 15px 0px;\n    justify-content: center;\n    gap: 30px;\n    align-items: center;\n"]))),M=f.b.div(G||(G=Object(x.a)(["\n    a {\n        display: flex;\n        flex-direction: column;\n        gap: 9px;\n        img {\n            width: 60px;\n        }\n    }\n"]))),J=f.b.div(U||(U=Object(x.a)(["\n    display: flex;\n    align-items: center;\n    outline: none;\n\n    div {\n        background-color: #0d5cb6;\n        padding: 0px 5px;\n        align-items: center;\n        height: 40px;\n        img {\n            height: 40px;\n            cursor: pointer;\n        }\n    }\n    input {\n        border: none;\n        height: 40px;\n        width: 600px;\n        padding: 0px 10px;\n        outline: none;\n    }\n"])));n(172);function $(e){return Object(H.jsxs)(k.a,Object(O.a)(Object(O.a)({},e),{},{size:"lg","aria-labelledby":"contained-modal-title-vcenter",centered:!0,children:[Object(H.jsx)(k.a.Header,{closeButton:!0,children:Object(H.jsx)(k.a.Title,{id:"contained-modal-title-vcenter",children:"Add Item"})}),Object(H.jsxs)(I.a,{children:[Object(H.jsxs)(k.a.Body,{children:[Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalEmail",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Name"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",name:"name",value:e.item.name,onChange:e.handleInputChange})})]}),Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalPassword",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Description"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",onChange:e.handleInputChange,name:"description",value:e.item.description})})]}),Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalPassword",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Price"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",name:"price",value:e.item.price,onChange:e.handleInputChange})})]}),Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalPassword",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Brand"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",name:"brand",value:e.item.brand,onChange:e.handleInputChange})})]}),Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalPassword",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Amount"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",name:"amount",value:e.item.amount,onChange:e.handleInputChange})})]}),Object(H.jsxs)(I.a.Group,{as:P.a,className:"mb-3",controlId:"formHorizontalPassword",children:[Object(H.jsx)(I.a.Label,{column:!0,sm:2,children:"Image Url"}),Object(H.jsx)(S.a,{sm:10,children:Object(H.jsx)(I.a.Control,{type:"",placeholder:"",name:"imgUrl",value:e.item.imgUrl,onChange:e.handleInputChange})})]})]}),Object(H.jsxs)(k.a.Footer,{children:[Object(H.jsx)(C.a,{onClick:e.handleAddButton,children:"Add"}),Object(H.jsx)(C.a,{onClick:e.onHide,children:"Close"})]})]})]}))}var K=function(e){var t=e.handleAddItem,n=e.handleSearchButton,c=l.a.useState(!1),a=Object(p.a)(c,2),r=a[0],i=a[1],o=Object(s.useState)(""),d=Object(p.a)(o,2),j=d[0],b=d[1],h={id:null,name:"",description:"",price:null,brand:"",amount:null,imgUrl:""},u=Object(s.useState)(h),m=Object(p.a)(u,2),x=m[0],f=m[1];return Object(H.jsx)(H.Fragment,{children:Object(H.jsx)(E,{children:Object(H.jsx)(y,{children:Object(H.jsxs)(R,{children:[Object(H.jsx)(M,{children:Object(H.jsxs)("a",{href:"https://my-app123sad.herokuapp.com/",children:[" ",Object(H.jsx)("img",{alt:"",src:"https://salt.tikicdn.com/ts/upload/ae/f5/15/2228f38cf84d1b8451bb49e2c4537081.png"}),Object(H.jsx)("img",{alt:"",src:"https://salt.tikicdn.com/ts/upload/e5/1d/22/61ff572362f08ead7f34ce410a4a6f96.png"})]})}),Object(H.jsxs)(J,{children:[Object(H.jsx)("input",{placeholder:"Search",onChange:function(e){return b(e.target.value)},onKeyPress:function(e){return"Enter"===e.key&&n(j)}}),Object(H.jsx)("div",{onClick:function(){n(j)},children:Object(H.jsx)("img",{alt:"",src:"https://salt.tikicdn.com/ts/upload/ed/5e/b8/8538366274240326978318348ea8af7c.png"})})]}),Object(H.jsxs)("div",{style:{display:"flex"},children:[Object(H.jsxs)("div",{className:"button",onClick:function(){return i(!0)},children:[Object(H.jsx)("span",{className:"button__mask"}),Object(H.jsx)("span",{className:"button__text",children:"Add Item"}),Object(H.jsx)("span",{className:"button__text button__text--bis",children:"Add Item"})]}),Object(H.jsx)($,{show:r,onHide:function(){return i(!1)},handleAddButton:function(){t(x),f(h),i(!1)},handleInputChange:function(e){var t=e.target,n=t.name,c=t.value;f(Object(O.a)(Object(O.a)({},x),{},Object(w.a)({},n,c)))},item:x})]})]})})})})},X=n(64),Y=n.n(X),q=n(27),Q=n.n(q),V=(n(204),n(281)),W=n(282),Z=n(98),ee=n(285),te=n(157),ne=function(e){for(var t=W.a.SubMenu,n=e.handleSortID,c=e.handleSortName,a=e.handleSortAmount,r=e.handleSortPrice,i=e.handleSortBrand,o=e.handleSortType,s=e.deleteFilter,l=e.filters,d=Object.values(l),j=[],b=0;b<d.length;b++)1!==b&&""!==d[b]&&null!==d[b]&&j.push(d[b]);var h=!0;j.length<1&&(h=!1);var u=Object(H.jsxs)(W.a,{children:[Object(H.jsxs)(t,{title:"Shoes",onTitleClick:function(e){o(e.key)},children:[Object(H.jsx)(W.a.Item,{onClick:function(e){o(e.key)},children:"Adidas"},"adidas"),Object(H.jsx)(W.a.Item,{onClick:function(e){o(e.key)},children:"Nike"},"nike"),Object(H.jsx)(W.a.Item,{onClick:function(e){o(e.key)},children:"Puma"},"puma"),Object(H.jsx)(W.a.Item,{onClick:function(e){o(e.key)},children:"New Balance"},"new balance")]},"shoes"),Object(H.jsxs)(t,{title:"Clothes",onTitleClick:function(e){o(e.key)},children:[Object(H.jsx)(W.a.Item,{onClick:function(e){o(e.key)},children:"Gucci"},"gucci"),Object(H.jsx)(W.a.Item,{onClick:function(e){o(e.key)},children:"Fendi"},"fendi")]},"clothes"),Object(H.jsxs)(t,{title:"Phone",onTitleClick:function(e){o(e.key)},children:[Object(H.jsx)(W.a.Item,{onClick:function(e){o(e.key)},children:"Iphone"},"iphone"),Object(H.jsx)(W.a.Item,{onClick:function(e){o(e.key)},children:"Samsung"},"samsung"),Object(H.jsx)(W.a.Item,{onClick:function(e){o(e.key)},children:"Xiaomi"},"xiaomi"),Object(H.jsx)(W.a.Item,{onClick:function(e){o(e.key)},children:"Huwei"},"huwei")]},"phone")]}),m=Object(H.jsxs)(W.a,{children:[Object(H.jsxs)(t,{title:"ID",children:[Object(H.jsx)(W.a.Item,{onClick:function(e){n(e.key)},children:"Asc"},"20"),Object(H.jsx)(W.a.Item,{onClick:function(e){n(e.key)},children:"Des"},"21")]},"id"),Object(H.jsxs)(t,{title:"Name",children:[Object(H.jsx)(W.a.Item,{onClick:function(e){c(e.key)},children:"Asc"},"22"),Object(H.jsx)(W.a.Item,{onClick:function(e){c(e.key)},children:"Des"},"23")]},"name"),Object(H.jsxs)(t,{title:"Price",children:[Object(H.jsx)(W.a.Item,{onClick:function(e){r(e.key)},children:"Asc"},"24"),Object(H.jsx)(W.a.Item,{onClick:function(e){r(e.key)},children:"Des"},"25")]},"price"),Object(H.jsxs)(t,{title:"Amount",children:[Object(H.jsx)(W.a.Item,{onClick:function(e){a(e.key)},children:"Asc"},"26"),Object(H.jsx)(W.a.Item,{onClick:function(e){a(e.key)},children:"Des"},"27")]},"amount"),Object(H.jsxs)(t,{title:"Brand",children:[Object(H.jsx)(W.a.Item,{onClick:function(e){i(e.key)},children:"Asc"},"28"),Object(H.jsx)(W.a.Item,{onClick:function(e){i(e.key)},children:"Des"},"29")]},"brand")]});return Object(H.jsxs)(H.Fragment,{children:[Object(H.jsxs)(y,{style:{justifyContent:"right",padding:"20px 0px 0px 0px",display:"flex",gap:"10px",alignItems:"center"},children:[!0===h?Object(H.jsx)(Z.a,{danger:!0,type:"text",onClick:function(){s()},children:"Remove filter"}):Object(H.jsx)(H.Fragment,{}),Object(H.jsx)(ee.a,{overlay:m,children:Object(H.jsxs)("div",{style:{color:"blue",cursor:"pointer"},className:"ant-dropdown-link",onClick:function(e){return e.preventDefault()},children:["Sort by ",Object(H.jsx)(te.a,{})]})}),Object(H.jsx)(ee.a,{overlay:u,children:Object(H.jsxs)("div",{style:{color:"blue",cursor:"pointer"},className:"ant-dropdown-link",onClick:function(e){return e.preventDefault()},children:["Filter ",Object(H.jsx)(te.a,{})]})})]}),Object(H.jsx)(y,{style:{padding:"0px 0px 10px 0px",display:"flex",justifyContent:"right",gap:"5px"},children:j.map((function(e,t){return Object(H.jsx)(Z.a,{type:"primary",children:e})}))})]})},ce=n(279);var ae=function(){var e,t=Object(s.useState)({}),n=Object(p.a)(t,2),c=n[0],a=n[1],r=Object(s.useState)(),i=Object(p.a)(r,2),o=i[0],l=i[1],d=Object(s.useState)(!0),j=Object(p.a)(d,2),b=j[0],x=j[1],f="https://my-app123sad.herokuapp.com/items/search?",w="https://my-app123sad.herokuapp.com/",v="https://my-app123sad.herokuapp.com/?",k=window.location.href,C=new URL(k);e={keyword:C.searchParams.get("keyword"),currentPage:null==C.searchParams.get("currentPage")?1:parseInt(C.searchParams.get("currentPage")),sortType:C.searchParams.get("sortType"),order:C.searchParams.get("order"),type:C.searchParams.get("type"),brand:C.searchParams.get("brand")};var I,P=Object(s.useState)(e),S=Object(p.a)(P,2),N=S[0],A=S[1],z=Object(s.useState)({total:null,pageSize:10}),D=Object(p.a)(z,2),T=D[0],B=D[1];function F(e){return e%2===0}var L=function(){var e=Object(u.a)(h.a.mark((function e(t){return h.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return l(o.filter((function(e){return e.id!==t}))),console.log(t),e.next=4,Y.a.delete(w+t).then((function(e){E(),window.alert("Delete item successfully")})).catch((function(e){return window.alert(e)}));case 4:case"end":return e.stop()}}),e)})));return function(t){return e.apply(this,arguments)}}(),G=function(){var e=Object(u.a)(h.a.mark((function e(t,n){return h.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return l(o.map((function(e){return e.id===t?n:e}))),e.next=3,Y.a.put(w,n).then((function(e){E(),window.alert("Update item successfully")})).catch((function(e){return window.alert(e)}));case 3:case"end":return e.stop()}}),e)})));return function(t,n){return e.apply(this,arguments)}}(),U=function(){var e=Object(u.a)(h.a.mark((function e(t){var n;return h.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return n=Object(O.a)(Object(O.a)({},N),{},{keyword:t,currentPage:1}),n=Q.a.stringify(n),e.next=4,Y.a.get(f+n).then((function(e){l(e.data),B(Object(O.a)(Object(O.a)({},T),{},{total:e.data.length})),A(Object(O.a)(Object(O.a)({},N),{},{keyword:t})),window.location.href=v+n})).catch((function(e){return window.alert(e)}));case 4:case"end":return e.stop()}}),e)})));return function(t){return e.apply(this,arguments)}}();function E(e){return R.apply(this,arguments)}function R(){return(R=Object(u.a)(h.a.mark((function e(t){var n,c;return h.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return n=Q.a.stringify(N),c=f+n,e.next=4,Y.a.get(c).then((function(e){l(e.data),x(!1),B(Object(O.a)(Object(O.a)({},T),{},{total:e.data.length}))})).catch((function(e){return window.alert(e)}));case 4:case"end":return e.stop()}}),e)})))).apply(this,arguments)}return Object(s.useEffect)((function(){E()}),[]),Object(H.jsxs)("div",{className:"App",children:[Object(H.jsx)(K,{handleAddItem:function(e){e.id=o.length+1,l([].concat(Object(m.a)(o),[e])),Y.a.post(w,e).then((function(e){E(),window.alert("Add item successfully")})).catch((function(e){return window.alert("All value should not be null")}))},handleSearchButton:U}),!0===b?Object(H.jsx)(H.Fragment,{children:Object(H.jsx)("div",{style:{textAlign:"center",padding:"200px 0px"},children:Object(H.jsx)(ce.a,{animation:"border",role:"status",style:{width:"200px",height:"200px"},children:Object(H.jsx)("span",{className:"visually-hidden",children:"Loading..."})})})}):Object(H.jsxs)(H.Fragment,{children:[Object(H.jsx)(ne,{handleSortID:function(e){I=F(e)?"acs":"des";var t=Object(O.a)(Object(O.a)({},N),{},{order:I,sortType:"id"});console.log(t),t=Q.a.stringify(t),console.log(t),window.location.href=v+t},handleSortName:function(e){I=F(e)?"acs":"des";var t=Object(O.a)(Object(O.a)({},N),{},{order:I,sortType:"name",currentPage:1});console.log(t),t=Q.a.stringify(t),console.log(t),window.location.href=v+t},handleSortAmount:function(e){I=F(e)?"acs":"des";var t=Object(O.a)(Object(O.a)({},N),{},{order:I,sortType:"amount",currentPage:1});console.log(t),t=Q.a.stringify(t),console.log(t),window.location.href=v+t},handleSortPrice:function(e){I=F(e)?"acs":"des";var t=Object(O.a)(Object(O.a)({},N),{},{order:I,sortType:"price",currentPage:1});console.log(t),t=Q.a.stringify(t),console.log(t),window.location.href=v+t},handleSortBrand:function(e){I=F(e)?"acs":"des";var t=Object(O.a)(Object(O.a)({},N),{},{order:I,sortType:"brand",currentPage:1});console.log(t),t=Q.a.stringify(t),console.log(t),window.location.href=v+t},handleSortType:function(e){var t;console.log(e),"shoes"===e||"clothes"===e||"phone"===e?(t=Object(O.a)(Object(O.a)({},N),{},{brand:"",type:e,currentPage:1}),t=Q.a.stringify(t),window.location.href=v+t):"adidas"===e||"nike"===e||"puma"===e||"new balance"===e?(t=Object(O.a)(Object(O.a)({},N),{},{brand:e,type:"shoes",currentPage:1}),t=Q.a.stringify(t),window.location.href=v+t):"gucci"===e||"fendi"===e?(t=Object(O.a)(Object(O.a)({},N),{},{brand:e,type:"clothes",currentPage:1}),t=Q.a.stringify(t),window.location.href=v+t):"iphone"!==e&&"samsung"!==e&&"xiaomi"!==e&&"huwei"!==e||(t=Object(O.a)(Object(O.a)({},N),{},{brand:e,type:"phone",currentPage:1}),t=Q.a.stringify(t),window.location.href=v+t)},deleteFilter:function(){var e={keyword:null,currentPage:1,sortType:null,order:null,type:null,brand:null};A(e);var t=e;t=Q.a.stringify(t),window.location.href=v+t},filters:e}),Object(H.jsx)(_,{items:o,deleteItem:L,editRow:function(e){a(e)},currentItem:c,updateItem:G,currentPage:N.currentPage,pageSize:T.pageSize}),Object(H.jsx)(y,{style:{padding:"15px 0px",textAlign:"right"},children:Object(H.jsx)(V.a,{current:N.currentPage,total:T.total,pageSize:T.pageSize,onChange:function(e){var t=Object(O.a)(Object(O.a)({},N),{},{currentPage:e});t=Q.a.stringify(t),window.location.href=v+t}})})]}),Object(H.jsx)(g,{})]})},re=function(e){e&&e instanceof Function&&n.e(3).then(n.bind(null,287)).then((function(t){var n=t.getCLS,c=t.getFID,a=t.getFCP,r=t.getLCP,i=t.getTTFB;n(e),c(e),a(e),r(e),i(e)}))};j.a.render(Object(H.jsx)(l.a.StrictMode,{children:Object(H.jsx)(ae,{})}),document.getElementById("root")),re()}},[[273,1,2]]]);
//# sourceMappingURL=main.dbac3a9b.chunk.js.map