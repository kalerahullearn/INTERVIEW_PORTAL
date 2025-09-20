import { Link } from "react-router-dom";

export const Button = ({primary, text}) => {
    return (
        <>
        {
            primary == true ? 
            <button className="bg-blue-800 text-white px-4 py-2 rounded-lg hover:bg-blue-600 cursor-pointer">
                        {text}
                    </button> :
            <Link to={"/"}>
            <button className="bg-gray-200 text-gray-700 px-4 py-2 rounded-lg hover:bg-gray-300 cursor-pointer">
                {text}
            </button>
        </Link>
        }
        </>
    );
}