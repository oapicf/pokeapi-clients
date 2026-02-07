#tag Class
Protected Class StatDetailAffectingMoves

	#tag Property, Flags = &h0
		increase() As OpenAPIClient.Models.StatDetailAffectingMovesIncreaseInner
	#tag EndProperty


	#tag Property, Flags = &h0
		decrease() As OpenAPIClient.Models.StatDetailAffectingMovesIncreaseInner
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
			Name="increase"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatDetailAffectingMovesIncreaseInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="decrease"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatDetailAffectingMovesIncreaseInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


