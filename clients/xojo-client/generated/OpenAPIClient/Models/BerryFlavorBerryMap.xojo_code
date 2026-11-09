#tag Class
Protected Class BerryFlavorBerryMap

	#tag Property, Flags = &h0
		#tag Note
			How powerful the referenced flavor is for this berry.
		#tag EndNote
		potency As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The berry with the referenced flavor.
		#tag EndNote
		berry As OpenAPIClient.Models.BerrySummary
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="potency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="berry"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BerrySummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


