export const getAllPanels = async () => {
    return await fetch("http://localhost:8083/panel/api/v1/master/").then(res => res.json());
}