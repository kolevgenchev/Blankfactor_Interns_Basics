using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task4
{
    public abstract class BaseCar
    {
        protected BaseCar(BaseModel baseModel, BaseEngine baseEngine, BaseCargo baseCargo)
        {
            this.BaseModel = baseModel;
            this.BaseEngine = baseEngine;
            this.BaseCargo = baseCargo;
            this.Tires = new List<BaseTire>();
        }

        public BaseModel BaseModel { get; set; }
        public BaseEngine BaseEngine { get; set; }
        public BaseCargo BaseCargo { get; set; }
        public ICollection<BaseTire> Tires { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.AppendLine($"{this.BaseModel.Name} with EnginePower -> {this.BaseEngine.EnginePower} EngineSpeed -> {this.BaseEngine.EngineSpeed} Cargo -> {this.BaseCargo.CargoType} CargoWeight {this.BaseCargo.CargoWeight:F2} TiresPresure -> {string.Join(",",this.Tires.Select(x => x.Pressure))} TiresAge -> {string.Join(",", this.Tires.Select(x => x.Age))}");

            return sb.ToString().Trim();
        }
    }
}
