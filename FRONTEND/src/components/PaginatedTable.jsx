import { useState } from "react";

export const PaginatedTable = ({dataList}) => {
  
  // Pagination state
  const [currentPage, setCurrentPage] = useState(1);
  const rowsPerPage = 1;

  // Pagination logic
  const indexOfLastRow = currentPage * rowsPerPage;
  const indexOfFirstRow = indexOfLastRow - rowsPerPage;
  const currentRows = (dataList || []).slice(indexOfFirstRow, indexOfLastRow);

  const totalPages = Math.ceil((dataList || []).length / rowsPerPage);

  return (
    <div className="pt-4">
      <div className="overflow-x-auto">
        <table className="min-w-full border border-gray-200 rounded-lg">
            <thead className="bg-blue-800 text-white">
            <tr>
                <th className="px-4 py-2 text-left">Name</th>
                <th className="px-4 py-2 text-left">Email</th>
                <th className="px-4 py-2 text-left">Level</th>
                <th className="px-4 py-2 text-left">Skills</th>
                <th className="px-4 py-2 text-left">Current Location</th>
                <th className="px-4 py-2 text-left">Experience</th>
                <th className="px-4 py-2 text-left">Cand Exp Upto</th>
                <th className="px-4 py-2 text-left"></th>
            </tr>
            </thead>
            <tbody>
            {
              currentRows && currentRows.map((row, i) => {
                return (
                  <tr className="odd:bg-white even:bg-gray-50" key ={i}>
                    <td className="px-4 py-2">{row.name}</td>
                    <td className="px-4 py-2">{row.email}</td>
                    <td className="px-4 py-2">{row.level}</td>
                    <td className="px-4 py-2">{row.skills}</td>
                    <td className="px-4 py-2">{row.currentLocation}</td>
                    <td className="px-4 py-2">{row.totalExperience}</td>
                    <td className="px-4 py-2">{row.candidateExperienceUpto}</td>
                </tr>
                )
              })
            }
            </tbody>
        </table>
      </div>  

      <div className="flex justify-center mt-4 space-x-2">
        <button
          className="px-3 py-1 border rounded disabled:opacity-50"
          onClick={() => setCurrentPage((prev) => Math.max(prev - 1, 1))}
          disabled={currentPage === 1}
        >
          Prev
        </button>

        {Array.from({ length: totalPages }, (_, i) => (
          <button
            key={i + 1}
            className={`px-3 py-1 border rounded ${
              currentPage === i + 1
                ? "bg-blue-500 text-white"
                : "hover:bg-gray-100"
            }`}
            onClick={() => setCurrentPage(i + 1)}
          >
            {i + 1}
          </button>
        ))}

        <button
          className="px-3 py-1 border rounded disabled:opacity-50"
          onClick={() =>
            setCurrentPage((prev) => Math.min(prev + 1, totalPages))
          }
          disabled={currentPage === totalPages}
        >
          Next
        </button>
      </div>
    </div>
  );
}
