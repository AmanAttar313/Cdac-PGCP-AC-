const ChildCompo = (props) => {
    const {newItem,newPrice,parentMethod}=props;
    return (
        <div>
            
            <h2>Child Component</h2>
            <div>Samosa:{newItem} </div>
            <div>price:{newPrice} </div>
            <button type="button" onClick={parentMethod}>Change Item Data</button>
        </div>
    )
}
export default ChildCompo;