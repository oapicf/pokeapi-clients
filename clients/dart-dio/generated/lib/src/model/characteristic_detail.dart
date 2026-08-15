//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/characteristic_description.dart';
import 'package:openapi/src/model/stat_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'characteristic_detail.g.dart';

/// CharacteristicDetail
///
/// Properties:
/// * [id] 
/// * [geneModulo] 
/// * [possibleValues] 
/// * [highestStat] 
/// * [descriptions] 
@BuiltValue()
abstract class CharacteristicDetail implements Built<CharacteristicDetail, CharacteristicDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'gene_modulo')
  int get geneModulo;

  @BuiltValueField(wireName: r'possible_values')
  BuiltList<int> get possibleValues;

  @BuiltValueField(wireName: r'highest_stat')
  StatSummary get highestStat;

  @BuiltValueField(wireName: r'descriptions')
  BuiltList<CharacteristicDescription> get descriptions;

  CharacteristicDetail._();

  factory CharacteristicDetail([void updates(CharacteristicDetailBuilder b)]) = _$CharacteristicDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CharacteristicDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CharacteristicDetail> get serializer => _$CharacteristicDetailSerializer();
}

class _$CharacteristicDetailSerializer implements PrimitiveSerializer<CharacteristicDetail> {
  @override
  final Iterable<Type> types = const [CharacteristicDetail, _$CharacteristicDetail];

  @override
  final String wireName = r'CharacteristicDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CharacteristicDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'gene_modulo';
    yield serializers.serialize(
      object.geneModulo,
      specifiedType: const FullType(int),
    );
    yield r'possible_values';
    yield serializers.serialize(
      object.possibleValues,
      specifiedType: const FullType(BuiltList, [FullType(int)]),
    );
    yield r'highest_stat';
    yield serializers.serialize(
      object.highestStat,
      specifiedType: const FullType(StatSummary),
    );
    yield r'descriptions';
    yield serializers.serialize(
      object.descriptions,
      specifiedType: const FullType(BuiltList, [FullType(CharacteristicDescription)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CharacteristicDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CharacteristicDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'gene_modulo':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.geneModulo = valueDes;
          break;
        case r'possible_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(int)]),
          ) as BuiltList<int>;
          result.possibleValues.replace(valueDes);
          break;
        case r'highest_stat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StatSummary),
          ) as StatSummary;
          result.highestStat.replace(valueDes);
          break;
        case r'descriptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CharacteristicDescription)]),
          ) as BuiltList<CharacteristicDescription>;
          result.descriptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CharacteristicDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CharacteristicDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

