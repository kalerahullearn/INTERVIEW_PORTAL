const PANEL_BACKEND_URL = import.meta.env.VITE_PANEL_BACKEND_URL;

export const getAllPanels = async () => {
    return await fetch(`${PANEL_BACKEND_URL}/panel/api/v1/master/`).then(res => res.json());
}